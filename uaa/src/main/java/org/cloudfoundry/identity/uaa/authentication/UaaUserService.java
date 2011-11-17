package org.cloudfoundry.identity.uaa.authentication;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Interface for loading user data for the UAA.
 */
public interface UaaUserService {
	UaaUser retrieveUserByName(String username) throws UsernameNotFoundException;
}
