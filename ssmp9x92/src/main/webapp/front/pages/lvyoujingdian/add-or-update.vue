<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">景点名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.jingdianmingcheng" v-model="ruleForm.jingdianmingcheng" placeholder="景点名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(224, 227, 225, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">景点类型</view>
				<picker @change="jingdianleixingChange" :value="jingdianleixingIndex" :range="jingdianleixingOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' class="uni-input">{{ruleForm.jingdianleixing?ruleForm.jingdianleixing:"请选择景点类型"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">景点地址</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.jingdiandizhi" v-model="ruleForm.jingdiandizhi" placeholder="景点地址"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}' class="cu-form-group" @tap="jingdiantupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">景点图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}' class="avator" v-if="ruleForm.jingdiantupian" :src="ruleForm.jingdiantupian" mode="aspectFill"></image>
					<image :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">营业时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' v-model="ruleForm.yingyeshijian" placeholder="营业时间" @tap="toggleTab('yingyeshijian')"></input>
			</view>
																																							<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"68rpx"}' :disabled="ro.price" v-model="ruleForm.price" placeholder="价格"></input>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(227, 228, 227, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">注意事项</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.zhuyishixiang" placeholder="注意事项"></textarea>
			</view>
						          				          							
			          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(227, 228, 227, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"left"}' class="title">景点介绍</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0, 102, 51, 1)","borderRadius":"0px","color":"rgba(0, 102, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.jingdianjieshao" placeholder="景点介绍"></textarea>
			</view>
						          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(0, 102, 51, 1)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																						<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="yingyeshijianConfirm" ref="yingyeshijian" themeColor="#333333"></w-picker>
																							
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												jingdianmingcheng: '',
																jingdianleixing: '',
																jingdiandizhi: '',
																jingdiantupian: '',
																yingyeshijian: '',
																jingdianjieshao: '',
																zhuyishixiang: '',
																												price: '',
												},
																				jingdianleixingOptions: [],
				jingdianleixingIndex: 0,
																																																																				// 登陆用户信息
				user: {},
                                ro:{
                                   jingdianmingcheng : false,
                                   jingdianleixing : false,
                                   jingdiandizhi : false,
                                   jingdiantupian : false,
                                   yingyeshijian : false,
                                   jingdianjieshao : false,
                                   zhuyishixiang : false,
                                   clicknum : false,
                                   price : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																												
																		// 下拉框
			res = await this.$api.option(`jingdianleixing`,`leixing`,{});
			this.jingdianleixingOptions = res.data;
																																																			
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`lvyoujingdian`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='jingdianmingcheng'){
					this.ruleForm.jingdianmingcheng = obj[o];
					this.ro.jingdianmingcheng = true;
					continue;
					}
					if(o=='jingdianleixing'){
					this.ruleForm.jingdianleixing = obj[o];
					this.ro.jingdianleixing = true;
					continue;
					}
					if(o=='jingdiandizhi'){
					this.ruleForm.jingdiandizhi = obj[o];
					this.ro.jingdiandizhi = true;
					continue;
					}
					if(o=='jingdiantupian'){
					this.ruleForm.jingdiantupian = obj[o];
					this.ro.jingdiantupian = true;
					continue;
					}
					if(o=='yingyeshijian'){
					this.ruleForm.yingyeshijian = obj[o];
					this.ro.yingyeshijian = true;
					continue;
					}
					if(o=='jingdianjieshao'){
					this.ruleForm.jingdianjieshao = obj[o];
					this.ro.jingdianjieshao = true;
					continue;
					}
					if(o=='zhuyishixiang'){
					this.ruleForm.zhuyishixiang = obj[o];
					this.ro.zhuyishixiang = true;
					continue;
					}
					if(o=='clicknum'){
					this.ruleForm.clicknum = obj[o];
					this.ro.clicknum = true;
					continue;
					}
					if(o=='price'){
					this.ruleForm.price = obj[o];
					this.ro.price = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																												
			// 多级联动参数
																																																												
																																																									
																																	// 日长控件选择日期时间
			yingyeshijianConfirm(val) {
				console.log(val)
				this.ruleForm.yingyeshijian = val.result;
				this.$forceUpdate();
			},
																														
															// 下拉变化
			jingdianleixingChange(e) {
				this.jingdianleixingIndex = e.target.value
				this.ruleForm.jingdianleixing = this.jingdianleixingOptions[this.jingdianleixingIndex]
			},
																																																
																																				jingdiantupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.jingdiantupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																						
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
																																								if((!this.ruleForm.price)){
					this.$utils.msg(`价格不能为空`);
					return
				}
																if(this.ruleForm.price&&(!this.$validate.isNumber(this.ruleForm.price))){
					this.$utils.msg(`价格应输入数字`);
					return
				}
																																if(this.ruleForm.id){
					await this.$api.update(`lvyoujingdian`, this.ruleForm);
				}else{
					await this.$api.add(`lvyoujingdian`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}
	
	.select .uni-input {
		line-height: 68rpx;
	}
	
	.input .right-input {
		line-height: 68rpx;
	}
</style>
