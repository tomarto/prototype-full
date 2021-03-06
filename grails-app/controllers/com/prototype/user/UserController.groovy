package com.prototype.user

import com.prototype.BaseController
import com.prototype.user.command.UserCommand
import grails.plugin.springsecurity.annotation.Secured

class UserController extends BaseController {

    UserService userService

    @Secured(value = ['isAuthenticated()'], httpMethod = 'GET')
    def get() {
        executeSafelyForJSON("get()", 'Unable to fetch AppUser details', log) {
            return userService.getLoggedUser()
        }
    }

    @Secured(value = ['isAnonymous()'], httpMethod = 'POST')
    def save(UserCommand userCommand) {
        executeSafelyForJSON("save($userCommand)", 'Unable to save new AppUser', log) {
            return userService.save(userCommand)
        }
    }
}
