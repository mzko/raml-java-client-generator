
package list.api;

import list.resource.users.Users;


/**
 * This api describes how to access to the users platform
 * 
 */
public class FooClient {

    private String _baseUrl;
    /**
     * Users in the platform
     * 
     */
    public final Users users;

    public FooClient(String baseUrl) {
        _baseUrl = baseUrl;
        users = new Users(getBaseUri());
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static FooClient create(String baseUrl) {
        return new FooClient(baseUrl);
    }

}
