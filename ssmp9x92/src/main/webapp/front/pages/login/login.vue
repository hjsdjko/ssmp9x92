<template>
	<view class="content">
		<view class="logo">
			<image :style='{"boxShadow":"0 0 0px #59f43e","borderColor":"#ccc","borderRadius":"200rpx","borderWidth":"0px","width":"200rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201209/edd741a06b384d60b45a69c54119e273.jpg","isShow":true,"height":"200rpx"}' src='http://codegen.caihongy.cn/20201209/edd741a06b384d60b45a69c54119e273.jpg' mode="aspectFill"></image>
		</view>
		<view class="uni-form-item uni-column">
			<input v-model="username" :style='{"borderColor":"rgba(153, 0, 51, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"4rpx","color":"rgba(153, 0, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' type="text" class="uni-input" name="" placeholder="请输入账号" />
		</view>
		<view class="uni-form-item uni-column">
			<input v-model="password" :style='{"borderColor":"rgba(153, 0, 51, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"4rpx","color":"rgba(153, 0, 51, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' type="password" class="uni-input" name="" placeholder="请输入密码" />
		</view>
		<view class="uni-form-item uni-column">
			<picker @change="optionsChange" :value="index" :range="options">
				<view class="uni-picker-type" :style='{"lineHeight":"80rpx","fontSize":"28rpx","color":"rgba(0, 102, 51, 1)","textAlign":"center"}'>{{options[index]}}</view>
			</picker>
		</view>
		<view>
			<button @tap="onLoginTap" type="primary" :style='{"borderColor":"rgba(153, 0, 51, 1)","backgroundColor":"rgba(153, 0, 51, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0px 0 8rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>登录</button>
		</view>
		<view class="links">
            			            <view class="link-highlight" @tap="onRegisterTap('yonghu')" :style='{"color":"rgba(204, 204, 0, 1)","fontSize":"24rpx"}'>注册用户</view>
            <view>|</view>
                        			            			            			            			            			            			            			            			            			            			<view @tap="onForgetTap" :style='{"color":"rgba(204, 204, 0, 1)","fontSize":"24rpx"}'>忘记密码？</view>
		</view>
		<!-- <view class="links">
			<view @tap="onForgetTap" :style='{"color":"rgba(204, 204, 0, 1)","fontSize":"24rpx"}'>忘记密码？</view>
		</view> -->
	</view>
</template>

<script>
	import menu from '@/utils/menu'

	export default {
		data() {
			return {
				username: '',
				password: '',
				options: [
					'请选择登录用户类型'
				],
                optionsValues: [
					'',
                    'yonghu',
				],
				index: 0
			}
		},
		onLoad() {
			let options = ['请选择登录用户类型'];
			let menus = menu.list();
			this.menuList = menus;
			for(let i=0;i<this.menuList.length;i++){
				if(this.menuList[i].hasFrontLogin=='是'){
					options.push(this.menuList[i].roleName);
				}
			}
			this.options = options;
			
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.loginFrom.content.input.backgroundColor
					// })
				})
			},
			onRegisterTap(tableName) {
                uni.setStorageSync("loginTable", tableName);
				this.$utils.jump('../register/register')
			},
			onForgetTap() {
				this.$utils.jump('../forget/forget')
			},
			async onLoginTap() {
                if (!this.optionsValues[this.index]) {
					this.$utils.msg('请选择登陆用户类型')
					return
				}
				let res = await this.$api.login(`${this.optionsValues[this.index]}`, {
					username: this.username,
					password: this.password
				});
				uni.setStorageSync("token", res.token);
				uni.setStorageSync("nickname",this.username);
				uni.setStorageSync("nowTable", `${this.optionsValues[this.index]}`);
				res = await this.$api.session(`${this.optionsValues[this.index]}`);
				// 保存用户id
				uni.setStorageSync("userid", res.data.id);
				uni.setStorageSync("role", `${this.options[this.index]}`);
				this.$utils.tab('../index/index');
			},
			optionsChange(e) {
				this.index = e.target.value
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 0 100upx;
		display: flex;
		justify-content: center;
		flex-direction: column;
		height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20210126/8367147870b44122b4cce613b9af5cf9.jpg);
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
			margin: 0;
			color: $color-primary
		}
	}
	
	
</style>
