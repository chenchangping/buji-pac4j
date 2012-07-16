/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.buji.oauth;

import org.scribe.up.profile.UserProfile;

/**
 * This profile is a mock with a mock provider type and no attributes definition.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public class MockUserProfile extends UserProfile {
    
    private static final long serialVersionUID = 3079771089205505215L;
    
    public MockUserProfile() {
    }
    
    public MockUserProfile(Object id) {
        super(id);
    }
}
