package com.geeks.authentication.impl.domain.exceptions

import com.geeks.authentication.impl.domain.entities.LoginField

class EmptyFiledException(field: LoginField) : Exception()