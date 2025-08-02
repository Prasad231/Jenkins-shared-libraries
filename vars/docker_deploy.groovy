def call(){
echo " Deploying image container using docker "
sh " docker run -d -p 8000:8000 notesapp:latest"

}
