/**
 * UserController
 */
app.controller('UserController', ['$scope', function($scope) {
	
	var self = this;
	
	self.isLoggedIn = false; 

//	UserService.session().then(function(resp) {
////		$scope.isLoggedIn = UserService.isLoggedIn;
//		self.isLoggedIn = true;
//		self.user = resp.data;
//		$scope.user = resp.data;
//	});
	
}]);