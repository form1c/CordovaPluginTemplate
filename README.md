
# Cordova Plugin Template 'MyPlugin'

## Overview

MyPlugin is a simple Cordova plugin that demonstrates how to create a custom plugin for Android. This plugin provides a method to show a toast message on the device. It serves as a basic example for developers looking to create their own Cordova plugins.

## Features

- Show toast messages on Android devices.
- Easy integration with Cordova applications.
- Simple JavaScript interface for invoking native functionality.

## Installation

To install the MyPlugin Cordova plugin, run the following command in your Cordova project directory:

```bash
cordova plugin add "/path/to/cordova/plugin"
```

## Usage

Once the plugin is installed, you can use it in your JavaScript code as follows:

```javascript
MyPlugin.showToast("Hello, World!", 
    function(successMessage) {
        console.log(successMessage);
    }, 
    function(errorMessage) {
        console.error(errorMessage);
    }
);
```

### Parameters

- `message` (String): The message to be displayed in the toast.
- `successCallback` (Function): A callback function that is called when the toast is successfully shown.
- `errorCallback` (Function): A callback function that is called if there is an error showing the toast.

## Plugin Structure

The plugin consists of the following key files:

- **plugin.xml**: The configuration file that defines the plugin's metadata, including its ID, version, and supported platforms.
- **MyPlugin.java**: The main Java class that implements the native functionality for the plugin.
- **MyPlugin.js**: The JavaScript interface that allows you to call the native functionality from your Cordova application.
- **package.json**: The package configuration file that includes metadata about the plugin.
