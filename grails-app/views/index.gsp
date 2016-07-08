<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta charset="utf-8">
        <title>Prototype</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <asset:stylesheet src="application.css"/>
    </head>

    <body ng-app="prototype" ng-controller="AppCtrl as appCtrl">
        <!--[if lte IE 8]>
          <p class="browsehappy">You are using an <strong>old</strong> browser. Please <a href="https://www.google.com/chrome/">update your explorer</a> for a better experience.</p>
        <![endif]-->

        <treasure-overlay-spinner active='spinner.active'>

            <div class="header">
                <div class="navbar navbar-default" role="navigation">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#js-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" ng-href="/">Prototype</a>
                        </div>

                        <div class="collapse navbar-collapse" id="js-navbar-collapse">
                            <ul class="nav navbar-nav">
                                <li ui-sref-active="active"><a href ui-sref="home">Home</a></li>
                                <li ui-sref-active="active" ng-hide="appCtrl.user" class="dropdown">
                                    <a href class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">User <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href ui-sref="login">Login</a></li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href ui-sref="register">Register</a></li>
                                    </ul>
                                </li>
                                <li ui-sref-active="active" ng-show="appCtrl.user"><a href ui-sref="actions">Actions</a></li>
                                <li ui-sref-active="active" ng-show="appCtrl.user"><a href ui-sref="checkout">Checkout</a></li>
                                <li ng-show="appCtrl.user" ng-click="appCtrl.logout()"><a href>Logout</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                    <span ng-show="appCtrl.errorMsg" uib-alert="" type="danger" close="" ng-bind="appCtrl.errorMsg"></span>
                    <span ng-show="appCtrl.successMsg" uib-alert="" type="success" close="" ng-bind="appCtrl.successMsg"></span>
                    <div ui-view=""></div>
            </div>

            <div class="footer">
                <div class="container">
                    <p><small>&copy;2016 Prototype</small></p>
                </div>
            </div>

        </treasure-overlay-spinner>

        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID -->
        <script>
            !function(A,n,g,u,l,a,r){A.GoogleAnalyticsObject=l,A[l]=A[l]||function(){
                (A[l].q=A[l].q||[]).push(arguments)},A[l].l=+new Date,a=n.createElement(g),
                r=n.getElementsByTagName(g)[0],a.src=u,r.parentNode.insertBefore(a,r)
            }(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

            ga('create', 'UA-XXXXX-X');
            ga('send', 'pageview');
        </script>

        <asset:javascript src="/prototype/prototype.js" />
    </body>
</html>
