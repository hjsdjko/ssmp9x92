const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmp9x92/",
            name: "ssmp9x92",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmp9x92/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧乡村旅游服务平台小程序"
        } 
    }
}
export default base
