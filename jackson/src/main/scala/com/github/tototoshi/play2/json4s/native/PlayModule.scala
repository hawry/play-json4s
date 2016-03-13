/*
 * Copyright 2013 Toshiyuki Takahashi
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

package com.github.tototoshi.play2.json4s.jackson

import org.json4s.{ JValue => Json4sJValue }
import com.github.tototoshi.play2.json4s.core._
import play.api.{ Environment, Configuration }
import play.api.inject.{ Module, Binding }

class Json4s(configuration: Configuration)
  extends Json4sParser[Json4sJValue](configuration, org.json4s.jackson.JsonMethods)

class Json4sModule extends Module {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[Json4s].toSelf
  )
}