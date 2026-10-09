def call() {
    echo 'Running code quality check'
    sh '''
        echo "Simulating code quality analysis..."
        sleep 5
        echo "Code quality stage completed"
    '''
}
