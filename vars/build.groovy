def call(String image, String tag){
  echo "Building a code using docker"
  sh "docker build -t ${image}:${tag}"
}
