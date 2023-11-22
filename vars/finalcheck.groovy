def call() {
    // Define tools and libraries
    def buildTools = tool name: 'maven', type: 'maven'
    def libraries = library 'your-library'

    // Checkout code
    stage('Checkout') {
        echo "Git Checkout"
    }

    // Build
    stage('Build') {
        #sh "${buildTools}/bin/mvn clean install"
    }

    // Deploy
    stage('Deploy') {
        // Add your deploy commands here
    }

    // Archive
    stage('Archive') {
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
    }
}
