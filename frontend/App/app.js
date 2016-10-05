/**
 * Created by Suveen on 09/09/16.
 */

var myApp = angular.module('myApp',[]);


myApp.controller('myCtrl',['$scope',function($scope,filterService){

        $scope.filterSelection1 = function() {
            alert("seen");
            filterService.passChoise($scope.filterType);

        };
        // $rootScope.fileName = '';
        $scope.suveen = 10;

    $scope.songname = function myFunction(){
        var x = document.getElementById("exampleInputFile");
        var txt = "";
        for (var i = 0; i < x.files.length; i++) {
            var file = x.files[i];
            songname1=file.name;
            if ('name' in file) {
                txt += "name: " + file.name + "<br>";
            }
        }
        document.getElementById("demo").innerHTML = txt;
        return songname1;
    }

    }]
);


myApp.factory('filterService',['$http',function($http){
    var fac = {};

    fac.passChoise = function(player)
    {
        $http.post("/api/fileupload", player).success(function(response){
            alert(response.status);
        })
    }

    return fac;
}]);

myApp.directive('filterChoice',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/template/filterSelection.html'
    };
})

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

myApp.directive('fileControl',function(){
    return {
        restrict : 'E',
        templateUrl : 'app/filterControl/filterControl.html',
    };
});


/*
var getFileName = function(){
    var fullPath = document.getElementById('exampleInputFile').value;
    var fileName = fullPath.replace(/^.*[\\\/]/, '');
    alert(fileName);
} */


