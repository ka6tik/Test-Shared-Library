def call(String name = "Kartik") {
    script {
        sh """
            echo Hi ${name}
        ""
    }
}
