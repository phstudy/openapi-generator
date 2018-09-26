package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import rx.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserApi {
  /**
   * Create user
   * This can only be done by the logged in user.
   * @param user Created user object (required)
   * @return Observable&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user")
  Observable<Void> createUser(
    @retrofit2.http.Body User user
  );

  /**
   * Creates list of users with given input array
   * 
   * @param user List of user object (required)
   * @return Observable&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/createWithArray")
  Observable<Void> createUsersWithArrayInput(
    @retrofit2.http.Body List<User> user
  );

  /**
   * Creates list of users with given input array
   * 
   * @param user List of user object (required)
   * @return Observable&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("user/createWithList")
  Observable<Void> createUsersWithListInput(
    @retrofit2.http.Body List<User> user
  );

  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted (required)
   * @return Observable&lt;Void&gt;
   */
  @DELETE("user/{username}")
  Observable<Void> deleteUser(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing. (required)
   * @return Observable&lt;User&gt;
   */
  @GET("user/{username}")
  Observable<User> getUserByName(
    @retrofit2.http.Path("username") String username
  );

  /**
   * Logs user into the system
   * 
   * @param username The user name for login (required)
   * @param password The password for login in clear text (required)
   * @return Observable&lt;String&gt;
   */
  @GET("user/login")
  Observable<String> loginUser(
    @retrofit2.http.Query("username") String username, @retrofit2.http.Query("password") String password
  );

  /**
   * Logs out current logged in user session
   * 
   * @return Observable&lt;Void&gt;
   */
  @GET("user/logout")
  Observable<Void> logoutUser();
    

  /**
   * Updated user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted (required)
   * @param user Updated user object (required)
   * @return Observable&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("user/{username}")
  Observable<Void> updateUser(
    @retrofit2.http.Path("username") String username, @retrofit2.http.Body User user
  );

}
