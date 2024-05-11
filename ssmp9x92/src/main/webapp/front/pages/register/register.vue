<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 0px #59f43e","borderColor":"#ccc","borderRadius":"200rpx","borderWidth":"0px","width":"200rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201209/3ae66a2ca46342eeb7323c7bd624b6f4.jpg","isShow":true,"height":"200rpx"}' src='http://codegen.caihongy.cn/20201209/3ae66a2ca46342eeb7323c7bd624b6f4.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.zhanghao" type="text" class="uni-input" name="" placeholder="账号" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
                        <picker @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
                                <view :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.dizhi" type="text" class="uni-input" name="" placeholder="地址" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shangjiazhanghao" type="text" class="uni-input" name="" placeholder="商家账号" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shangjiaxingming" type="text" class="uni-input" name="" placeholder="商家姓名" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shoujihao" type="text" class="uni-input" name="" placeholder="手机号" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.dizhi" type="text" class="uni-input" name="" placeholder="地址" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"rgba(254, 254, 254, 1)","backgroundColor":"rgba(153, 0, 51, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0px","fontSize":"32rpx","borderStyle":"solid","height":"90rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                        	this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.zhanghao&&(!this.$validate.isMobile(this.ruleForm.zhanghao))){
					this.$utils.msg(`账号应输入手机格式`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
					this.$utils.msg(`余额应输入数字`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
					this.$utils.msg(`手机号应输入手机格式`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
					this.$utils.msg(`余额应输入数字`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
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

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
