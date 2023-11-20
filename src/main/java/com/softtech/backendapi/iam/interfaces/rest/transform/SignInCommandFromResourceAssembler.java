package com.softtech.backendapi.iam.interfaces.rest.transform;

import com.softtech.backendapi.iam.domain.model.commands.SignInCommand;
import com.softtech.backendapi.iam.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource signInResource) {
        return new SignInCommand(signInResource.username(), signInResource.password());
    }
}
