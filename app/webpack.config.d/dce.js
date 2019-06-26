(function () {
    var path = require('path');

    // config.entry = [path.resolve(__dirname, "../../../../app/build/kotlin-js-min/main/kotlinjs-multi-module-app.js")];
    config.entry = "./kotlin/kotlinjs-multi-module-app.js";

    config.output = {
        path: path.resolve(__dirname, "../../../../app/build/libs"),
        filename: 'kotlinjs-multi-module-app.js'
    };

    // config.resolve.modules.push(path.resolve(__dirname, "../../../../app/build/kotlin-js-min/main"));

    config.mode = "production";
})();