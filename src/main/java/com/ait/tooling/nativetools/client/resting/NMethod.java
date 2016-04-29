/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.tooling.nativetools.client.resting;

import com.ait.tooling.common.api.types.IStringValued;

public enum NMethod implements IStringValued
{
    GET("GET"), POST("POST"), PUT("PUT"), PATCH("PATCH"), DELETE("DELETE"), HEAD("HEAD");

    private final String m_valu;

    private NMethod(final String valu)
    {
        m_valu = valu;
    }

    @Override
    public String getValue()
    {
        return m_valu;
    }

    @Override
    public String toString()
    {
        return m_valu;
    }
}
