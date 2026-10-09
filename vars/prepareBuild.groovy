def call() {
    echo 'Preparing the application build'
    sh '''
        mkdir -p output
        echo "Build workspace initialized"
    '''
}
