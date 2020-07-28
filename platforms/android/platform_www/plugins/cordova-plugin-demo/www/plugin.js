cordova.define("cordova-plugin-demo.demo", function(require, exports, module) {
window.demo = {
  sayHello: function (name, onSuccess, onFail) {
    cordova.exec(onSuccess, onFail, "Demo", "say-hello", [name]);
  }
};
});
