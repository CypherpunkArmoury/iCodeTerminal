cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "cordova-plugin-demo.demo",
      "file": "plugins/cordova-plugin-demo/www/plugin.js",
      "pluginId": "cordova-plugin-demo",
      "clobbers": [
        "cordova.plugins.demo"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.4",
    "cordova-plugin-demo": "0.0.1"
  };
});