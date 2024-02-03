package org.waitforme.backend.model.request.auth

import javax.validation.constraints.Pattern

data class LocalAuthRequest(
    @field:Pattern(regexp = "010-[0-9]{3,4}-[0-9]{4}")
    val phoneNumber: String,
    val authText: String? = null,
)
