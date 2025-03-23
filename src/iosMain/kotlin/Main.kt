import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeViewController { App() }
}