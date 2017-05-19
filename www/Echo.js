var exec = require('cordova/exec');

exports.say = function(arg0, success, error) {
    exec(success, error, "Echo", "say", [arg0]);
};
