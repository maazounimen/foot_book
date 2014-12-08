package gitlab_gen.services;

import gitlab_gen.model.User;

public interface IGitlabGenLocal {

	boolean createGitlabUser(User user);

}
