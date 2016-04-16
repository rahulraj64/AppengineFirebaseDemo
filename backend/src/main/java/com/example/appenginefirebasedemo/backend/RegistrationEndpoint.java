/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Backend with Google Cloud Messaging" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/GcmEndpoints
*/

package com.example.appenginefirebasedemo.backend;

import com.firebase.client.Firebase;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;

import java.util.List;
import java.util.logging.Logger;
import javax.inject.Named;

import static com.example.appenginefirebasedemo.backend.OfyService.ofy;

@Api(
  name = "registration",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.appenginefirebasedemo.example.com",
    ownerName = "backend.appenginefirebasedemo.example.com",
    packagePath=""
  )
)
public class RegistrationEndpoint {

    private static final Logger log = Logger.getLogger(RegistrationEndpoint.class.getName());


    @ApiMethod(name = "register")
    public void registerDevice(@Named("regId") String regId) {


        Firebase ref = new Firebase("https://YOUR_APP_ID.firebaseio.com");
        ref.child("gcm").setValue(regId);

    }


    @ApiMethod(name = "unregister")
    public void unregisterDevice(@Named("regId") String regId) {

    }


    @ApiMethod(name = "listDevices")
    public CollectionResponse<RegistrationRecord> listDevices(@Named("count") int count) {
        return null;
    }

}
