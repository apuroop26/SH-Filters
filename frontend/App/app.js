/**
 * Created by Suveen on 09/09/16.
 */

var myApp = angular.module('myApp',[]);

myApp.directive('navbarJumbotron',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/navbar-jumbotron.html'
    };
});

myApp.directive('howtoUse',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/howtouse.html'
    };
});

myApp.directive('feaTures',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/feaTures.html'
    };
});

myApp.directive('feedBack',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/feedBack.html'
    };
});

myApp.directive('secTions',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/sections.html'
    };
});

myApp.directive('contactUs',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/contactUs.html'
    };
});

myApp.directive('fooTer',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/footer.html'
    };
});

myApp.directive('uploadFile',function($rootScope){
    return {
        restrict : 'E',
        templateUrl : 'app/template/uploadFile.html',
        controller : function ($scope, $element) {
            //var files = '';
             var files = $element.on('change', function  ($evt) {
                files = $evt.target.files;
                //$rootScope.files = files;
                console.log(files[0].name);
                console.log(files[0].size);
                return files[0].name;

            });
            $scope.files = files;


            console.log(files);
        },
        //controllerAs : uploadController
    };
});


myApp.directive('audioPlay',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/audioPlay.html'
    };
});
/*
var getFileName = function(){
    var fullPath = document.getElementById('exampleInputFile').value;
    var fileName = fullPath.replace(/^.*[\\\/]/, '');
    alert(fileName);
} */

myApp.controller('myCtrl',function($scope, $rootScope){
$rootScope.fileName = '';
});
