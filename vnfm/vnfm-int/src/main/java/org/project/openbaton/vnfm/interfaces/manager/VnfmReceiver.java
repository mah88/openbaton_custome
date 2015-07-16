/*
 * Copyright (c) 2015 Fraunhofer FOKUS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.project.openbaton.vnfm.interfaces.manager;

import org.project.openbaton.catalogue.nfvo.CoreMessage;
import org.project.openbaton.nfvo.exceptions.NotFoundException;
import org.project.openbaton.nfvo.exceptions.VimException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;

import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 * Created by lto on 08/07/15.
 */
public interface VnfmReceiver {

    @JmsListener(destination = "vnfm-core-actions", containerFactory = "queueJmsContainerFactory")
    void actionFinished(@Payload CoreMessage coreMessage) throws NotFoundException, NamingException, JMSException, VimException;
}