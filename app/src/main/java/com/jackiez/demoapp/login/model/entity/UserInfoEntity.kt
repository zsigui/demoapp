package com.jackiez.demoapp.login.model.entity

import com.jackiez.demoapp.common.json.BaseEntity

data class UserInfoEntity(val nickname: String,
                          val username: String,
                          val phone: String,
                          val avatarImg: String,
                          val avatarThumbImg: String,
                          val desc: String): BaseEntity