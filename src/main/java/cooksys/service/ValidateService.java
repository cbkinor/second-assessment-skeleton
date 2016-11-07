package cooksys.service;

public interface ValidateService {

	boolean doesUsernameExist(String username);

	boolean isUsernameAvailable(String username);

	boolean doesHashTagExist(String hashtag);

}
