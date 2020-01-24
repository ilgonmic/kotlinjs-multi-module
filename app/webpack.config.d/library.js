// It is necessary for library mode, if you want to use result bundle as a LavaScript library
// and use some functions from it
config.output = config.output || {};
config.output.libraryTarget = "umd";
config.output.library = "app";