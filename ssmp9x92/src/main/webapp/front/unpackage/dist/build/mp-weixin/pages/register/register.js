(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{"08ef":function(e,t,n){"use strict";n.r(t);var r=n("5cd3"),a=n("4465");for(var u in a)"default"!==u&&function(e){n.d(t,e,(function(){return a[e]}))}(u);n("78b1");var i,o=n("f0c5"),s=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"27c03b6a",null,!1,r["a"],i);t["default"]=s.exports},"17bf":function(e,t,n){},"3fe0":function(e,t,n){"use strict";(function(e){n("29b3");r(n("66fd"));var t=r(n("08ef"));function r(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,n("543d")["createPage"])},4465:function(e,t,n){"use strict";n.r(t);var r=n("dc22"),a=n.n(r);for(var u in r)"default"!==u&&function(e){n.d(t,e,(function(){return r[e]}))}(u);t["default"]=a.a},"5cd3":function(e,t,n){"use strict";var r;n.d(t,"b",(function(){return a})),n.d(t,"c",(function(){return u})),n.d(t,"a",(function(){return r}));var a=function(){var e=this,t=e.$createElement;e._self._c},u=[]},"78b1":function(e,t,n){"use strict";var r=n("17bf"),a=n.n(r);a.a},dc22:function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=a(n("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,t,n,r,a,u,i){try{var o=e[u](i),s=o.value}catch(l){return void n(l)}o.done?t(s):Promise.resolve(s).then(r,a)}function i(e){return function(){var t=this,n=arguments;return new Promise((function(r,a){var i=e.apply(t,n);function o(e){u(i,r,a,o,s,"next",e)}function s(e){u(i,r,a,o,s,"throw",e)}o(void 0)}))}}var o={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var t=this;return i(r.default.mark((function n(){var a;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:[],a=e.getStorageSync("loginTable"),t.tableName=a,"yonghu"==t.tableName&&(t.yonghuxingbieOptions="男,女".split(","),t.ruleForm.xingbie=t.yonghuxingbieOptions[0]),t.styleChange();case 5:case"end":return n.stop()}}),n)})))()},methods:{yonghuxingbieChange:function(e){this.yonghuxingbieIndex=e.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=this;return i(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.ruleForm.zhanghao||"yonghu"!=e.tableName){t.next=3;break}return e.$utils.msg("账号不能为空"),t.abrupt("return");case 3:if("yonghu"!=e.tableName||!e.ruleForm.zhanghao||e.$validate.isMobile(e.ruleForm.zhanghao)){t.next=6;break}return e.$utils.msg("账号应输入手机格式"),t.abrupt("return");case 6:if(e.ruleForm.mima||"yonghu"!=e.tableName){t.next=9;break}return e.$utils.msg("密码不能为空"),t.abrupt("return");case 9:if("yonghu"!=e.tableName||!e.ruleForm.shouji||e.$validate.isMobile(e.ruleForm.shouji)){t.next=12;break}return e.$utils.msg("手机应输入手机格式"),t.abrupt("return");case 12:if("yonghu"!=e.tableName||!e.ruleForm.youxiang||e.$validate.isEmail(e.ruleForm.youxiang)){t.next=15;break}return e.$utils.msg("邮箱应输入邮件格式"),t.abrupt("return");case 15:if("yonghu"!=e.tableName||!e.ruleForm.money||e.$validate.isNumber(e.ruleForm.money)){t.next=18;break}return e.$utils.msg("余额应输入数字"),t.abrupt("return");case 18:if("shangjia"!=e.tableName||!e.ruleForm.shoujihao||e.$validate.isMobile(e.ruleForm.shoujihao)){t.next=21;break}return e.$utils.msg("手机号应输入手机格式"),t.abrupt("return");case 21:if("shangjia"!=e.tableName||!e.ruleForm.youxiang||e.$validate.isEmail(e.ruleForm.youxiang)){t.next=24;break}return e.$utils.msg("邮箱应输入邮件格式"),t.abrupt("return");case 24:if("shangjia"!=e.tableName||!e.ruleForm.money||e.$validate.isNumber(e.ruleForm.money)){t.next=27;break}return e.$utils.msg("余额应输入数字"),t.abrupt("return");case 27:return t.next=29,e.$api.register("".concat(e.tableName),e.ruleForm);case 29:e.$utils.msgBack("注册成功");case 31:case"end":return t.stop()}}),t)})))()}}};t.default=o}).call(this,n("543d")["default"])}},[["3fe0","common/runtime","common/vendor"]]]);