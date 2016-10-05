/**
 * Created by Suveen on 07/09/16.
 */
myApp.controller('submitController', ['$scope', 'multipartForm', function ($scope, multipartForm, $http) {
    $scope.customer = {};
    $scope.Submit = function(){
        var uploadUrl = '/api/fileupload';
        multipartForm.post(uploadUrl, $scope.customer );

    }
/*
    $scope.getFileName = function(){
        var fullPath = document.getElementById('exampleInputFile').value;
        var fileName = fullPath.replace(/^.*[\\\/]/, '');
        alert(fileName);
        return fileName;
    }
*/

  /*  $scope.customer1 = {};
    $scope.play1 = function(){
        var uploadUrl1 = '/api/path/all/';
        console.log(uploadUrl1);
        $http.get(uploadUrl1, $scope.customer );

    }
*/

}])