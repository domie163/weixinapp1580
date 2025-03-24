import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import dangyuanxinxi from '@/views/modules/dangyuanxinxi/list'
    import news from '@/views/modules/news/list'
    import huifuxinxi from '@/views/modules/huifuxinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import discussxuexiziliao from '@/views/modules/discussxuexiziliao/list'
    import renwupaiming from '@/views/modules/renwupaiming/list'
    import forum from '@/views/modules/forum/list'
    import baomingxinxi from '@/views/modules/baomingxinxi/list'
    import xuexiziliao from '@/views/modules/xuexiziliao/list'
    import renwuxinxi from '@/views/modules/renwuxinxi/list'
    import meiridaka from '@/views/modules/meiridaka/list'
    import config from '@/views/modules/config/list'
    import jiaoliuxinxi from '@/views/modules/jiaoliuxinxi/list'
    import jijifenzi from '@/views/modules/jijifenzi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/dangyuanxinxi',
        name: '党员信息',
        component: dangyuanxinxi
      }
      ,{
	path: '/news',
        name: '新闻公告',
        component: news
      }
      ,{
	path: '/huifuxinxi',
        name: '回复信息',
        component: huifuxinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/discussxuexiziliao',
        name: '学习资料评论',
        component: discussxuexiziliao
      }
      ,{
	path: '/renwupaiming',
        name: '任务排名',
        component: renwupaiming
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/baomingxinxi',
        name: '报名信息',
        component: baomingxinxi
      }
      ,{
	path: '/xuexiziliao',
        name: '学习资料',
        component: xuexiziliao
      }
      ,{
	path: '/renwuxinxi',
        name: '任务信息',
        component: renwuxinxi
      }
      ,{
	path: '/meiridaka',
        name: '每日打卡',
        component: meiridaka
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiaoliuxinxi',
        name: '交流信息',
        component: jiaoliuxinxi
      }
      ,{
	path: '/jijifenzi',
        name: '积极分子',
        component: jijifenzi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
