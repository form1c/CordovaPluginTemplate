
/* global cordova, module */
module.exports = {
    showToast: function(message, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, 'MyPlugin', 'showToast', [message]);
    }
};
