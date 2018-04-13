package lfernando.retrofittest;

import lfernando.retrofittest.pojo.MultipleResource;
import lfernando.retrofittest.pojo.User;
import lfernando.retrofittest.pojo.UserList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetListUsers(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField (@Field("name") String name, @Field("job") String job);
}
