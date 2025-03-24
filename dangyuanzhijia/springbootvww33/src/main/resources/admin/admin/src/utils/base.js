const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootvww33/",
            name: "springbootvww33",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootvww33/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "党员之家服务系统小程序"
        } 
    }
}
export default base
