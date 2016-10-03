
var app = angular.module('TaqApp', ['ui.bootstrap', 'ngRoute']);

	app.controller('SignInController', function($scope, $uibModal, SignInHandler){

			$scope.signIn = function (size) {

				var modalInstance = $uibModal.open({
					ariaLabelledBy: 'modal-title',
					ariaDescribedBy: 'modal-body',
					templateUrl: 'signIn',
					controller: 'SignInModalController',
					backdrop: 'static',
  					keyboard: true
					
				});

				modalInstance.result.then(function (added) {
				  if(added){
				  	$scope.noteAdded = true;
				  }
				  else{
				  	$scope.noteAdded = false;
				  }
				}, function () {
				});
			};
		

	});

	app.controller('PageController', function($scope){
		var page = 1;

		this.setPage = function(newPage){
			page = newPage;
		}
		this.getPage = function(){
			return page;
		}
	});

	app.controller('TabController', function($scope){
			var tab = 1;

			this.setTab = function(newTab){
				tab = newTab;
			}
			this.getTab = function(){
				return tab;
			}

	});

	app.controller('SignInModalController', function ($scope, $uibModalInstance, $location) {
		$scope.studentSignIn = function(){

			$uibModalInstance.close();
		}
		$scope.taSignIn = function(){

		}
		$scope.teacherSignIn = function(){

			//$uibModalInstance.close();
		}

	});

	app.service("SignInHandler", function(){
		
		var person = {email: "", name: "", isStudent: false};
		
		this.getEmail = function(){
			return person.email;
		}
		this.getname = function(){
			return person.name;
		}
		this.getIsStudent = function(){
			return person.isStudent;
		}
    	this.setEmail = function(newEmail){
			this.email = newEmail;
		}
		this.setname = function(newName){
			this.name = newName;
		}
		this.setIsStudent = function(newIsStudent){
			this.isStudent = newIsStudent;
		}

	});
	//filters ng-repeat for reversed table for better scanning UI
	app.filter('reverse', function() {
      return function(items) {
        return items.slice().reverse();
      };
    });

	app.config(['$routeProvider',function($routeProvider){
		$routeProvider
			// route for the student view
			.when('/student', {
				templateUrl : 'pages/student.html',
				controller  : 'StudentController'
			})

			// route for the ta view
			.when('/ta', {
				templateUrl : 'pages/ta.html',
				controller  : 'TAController'
			})
			//route for the teacher view
			.when('/teacher', {
				templateUrl : 'pages/contact.html',
				controller  : 'TeacherController'
			});
	}]);

	// create the controller and inject Angular's $scope
	app.controller('StudentController', function($scope) {
		// create a message to display in our view
		$scope.message = 'This is the student';
	});

	app.controller('TAController', function($scope) {
		$scope.message = 'This is the TA';
	});

	app.controller('TeacherController', function($scope) {
		$scope.message = 'This is the Teacher';
	});