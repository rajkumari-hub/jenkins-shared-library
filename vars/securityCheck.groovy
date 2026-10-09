def call() {
    echo 'Running security check'
    sh '''
        echo "Simulating dependency security scan..."
        sleep 5
        echo "Security check stage completed"
    '''
}
