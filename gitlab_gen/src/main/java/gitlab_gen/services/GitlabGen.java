package gitlab_gen.services;

import static org.junit.Assume.assumeNoException;
import gitlab_gen.model.User;

import java.io.IOException;
import java.net.ConnectException;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.gitlab.api.GitlabAPI;
import org.gitlab.api.models.GitlabUser;

@Stateless
@Local(value = IGitlabGenLocal.class)
public class GitlabGen implements IGitlabGenLocal {

	private GitlabAPI _api;
	private static final String TEST_URL = System.getProperty("TEST_URL",
			"http://192.168.92.24");
	private static final String TEST_TOKEN = System.getProperty("TEST_TOKEN",
			"gqnHPNPCf4TQKQx5MkYT");
	String rand = UUID.randomUUID().toString().replace("-", "").substring(0, 8);

	@PostConstruct
	public void setup() throws IOException {
		_api = GitlabAPI.connect(TEST_URL, TEST_TOKEN);
		try {
			_api.dispatch().with("login", "INVALID").with("password", rand)
					.to("session", GitlabUser.class);
		} catch (ConnectException e) {
			assumeNoException("GITLAB not running on '" + TEST_URL
					+ "', skipping...", e);
		} catch (IOException e) {
			final String message = e.getMessage();
			if (!message.equals("{\"message\":\"401 Unauthorized\"}")) {
				throw new AssertionError("Expected an unauthorized message", e);
			}
		}
	}

	public boolean createGitlabUser(User user) {
		boolean b = false;
		try {
			_api.createUser(user.getMail(), "Azerty123", user.getName(),
					user.getName(), "", "", "", "", 10, "", "", "", false,
					false, true);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

	private String randVal(String postfix) {
		return rand + "-" + postfix;
	}

}
