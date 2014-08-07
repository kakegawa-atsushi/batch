package controllers.batch;

import play.*;
import play.mvc.*;

import views.html.*;

import models.User;

public class RootController extends Controller {

    public static Result index() {
        User user = new User();
        return ok("Your new application is ready.");
    }

}