/**
 * Created by Suveen on 07/09/16.
 */
myApp.controller('submitController', ['$scope', 'multipartForm', function ($scope, multipartForm) {
    $scope.customer = {};
    $scope.Submit = function(){
        var uploadUrl = '/api/fileupload';
        multipartForm.post(uploadUrl, $scope.customer );
    }
}])