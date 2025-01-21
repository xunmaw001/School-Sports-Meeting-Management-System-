const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmrt393/",
            name: "ssmrt393",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmrt393/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校运会管理系统"
        } 
    }
}
export default base
