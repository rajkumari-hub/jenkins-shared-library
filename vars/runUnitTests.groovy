def call() {
    echo 'Running unit tests'
    sh '''
        echo "Simulating unit tests..."
        sleep 5
        echo "Unit test stage completed"
    '''
}
