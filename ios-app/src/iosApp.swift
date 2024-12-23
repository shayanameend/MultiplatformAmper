import SwiftUI
import iosappKotlin

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> some UIViewController {
        ViewControllerKt.makeComposeUIViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
    }
}

struct ContentView: View {
    var body: some View {
        ComposeView().ignoresSafeArea(.all, edges: .bottom)
    }
}

@main
struct iosApp: App {
    init() {
        KoinKt.doInit()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}