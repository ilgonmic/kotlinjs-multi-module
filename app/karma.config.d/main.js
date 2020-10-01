;(function(config) {
    const path = require("path")

    config.reporters.push("coverage-istanbul")
    config.plugins.push("karma-coverage-istanbul-reporter")

    config.webpack.module.rules.push(
        {
            test: /\.js$/,
            use: {loader: 'istanbul-instrumenter-loader'},
            include: [path.resolve(__dirname, '../kotlinjs-multi-module-app/kotlin/')]
        }
    )

    config.coverageIstanbulReporter = {
        reports: ["html"]
    }
}(config));