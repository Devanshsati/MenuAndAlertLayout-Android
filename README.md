# Menu and Alert Layout

This Android package (`com.example.menuandalertlayout`) provides functionalities for creating custom menus and alert dialogs with enhanced UI elements.

## Installation

To integrate this package into your Android project, follow these steps:

1. **Clone the Repository**: Clone this repository into your local environment.

2. **Copy the Package**: Copy the `menuandalertlayout` package into your Android project's source directory.

3. **Import Statements**: Include the necessary import statements in your project's files where you intend to use the functionalities provided by this package.

4. **Usage**: Utilize the classes and methods provided in this package to create custom menus and alert dialogs with ease.

## Features

### Custom Menus

The `CustomMenu` class allows you to create custom popup menus with icons and handle item selections efficiently. You can easily customize the menu items and their functionalities according to your application's requirements.

Example usage:

```kotlin
CustomMenu().showMenu(context, view)
```

### Enhanced Alert Dialogs

The `MainActivity` class demonstrates how to create enhanced alert dialogs using the `AlertDialog` and `SweetAlertDialog` libraries. These dialogs support various types (e.g., success, error, warning) and come with customizable title, message, buttons, and icons.

Example usage:

```kotlin
// Creating a basic alert dialog
AlertDialog.Builder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setIcon(R.drawable.icon)
    .setPositiveButton("OK") { _, _ ->
        // Positive button click action
    }
    .setNegativeButton("Cancel") { _, _ ->
        // Negative button click action
    }
    .show()
```

```kotlin
// Creating a SweetAlertDialog
SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE)
    .setTitleText("Success!")
    .setContentText("Your operation was successful.")
    .show()
```

## Compatibility

This package is compatible with Android projects targeting API level 21 (Android 5.0 Lollipop) and above.

## License

This package is distributed under the [MIT License](LICENSE).
