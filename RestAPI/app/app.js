/**
 * Created by Suveen on 09/09/16.
 */

var myApp = angular.module('myApp',[]);

myApp.controller('myCtrl',function($scope){

    $scope.search = function(username){
        $http.get("https://api.github.com/users/"+username).then(onUserComplete, onError)
    };

    var onUserComplete = function(response){
        $scope.user = response.data;
        $http.get($scope.user.repos_url).then(onRepos, onError)
    };

    var onRepos = function(response){
        $scope.repos = response.data;
    };

    var onError = function(reason){
        $scope.error = "oops, there is an error!"
    };

});
