config.set({
    browsers: ['ChromeHeadlessNoSandbox'],
    customLaunchers: {
        ChromeHeadlessNoSandbox: {
            base: 'ChromeHeadless2',
            flags: ['--no-sandbox']
        }
    },
});