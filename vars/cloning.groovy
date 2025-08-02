def call(String url, String branch){
echo "cloning a code from GitHub"
git url: "$(url)", branch: "$(branch)"
echo "cloning a code from GitHub completed"
}
